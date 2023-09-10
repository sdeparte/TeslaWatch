package com.example.amazfirstratostestapp

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.bluetooth.BluetoothGattCallback
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.content.res.AssetManager
import android.os.Bundle
import android.os.IBinder
import android.support.v4.content.res.ResourcesCompat
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import okhttp3.*
import java.io.IOException


class MainActivity : AppCompatActivity() {
    private val client = OkHttpClient()

    private var mDeviceAddress: String? = null
    private var mBluetoothLeService: BluetoothLeService? = null

    // Code to manage Service lifecycle.
    private val mServiceConnection = object : ServiceConnection {

        override fun onServiceConnected(componentName: ComponentName, service: IBinder) {
            mBluetoothLeService = (service as BluetoothLeService.LocalBinder).service
            if (!mBluetoothLeService!!.initialize()) {
                Log.e("test", "Unable to initialize Bluetooth")
                finish()
            }
            // Automatically connects to the device upon successful start-up initialization.
            mBluetoothLeService!!.connect(mDeviceAddress)
        }

        override fun onServiceDisconnected(componentName: ComponentName) {
            mBluetoothLeService = null
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()

        if (bluetoothAdapter != null) {
            if (!bluetoothAdapter.isEnabled) {
                bluetoothAdapter.enable()
            }

            val gattServiceIntent = Intent(this, BluetoothLeService::class.java)

            val scanCallback = BluetoothAdapter.LeScanCallback { device, _, _ ->
                if (device.name.equals("f")) {
                    mDeviceAddress = device.address

                    bindService(gattServiceIntent, mServiceConnection, Context.BIND_AUTO_CREATE)
                }
            }
        }

        val batteryLyt = findViewById<LinearLayout>(R.id.battery_layout)
        batteryLyt.setOnClickListener {
            TeslaBtConnection.test(assets.open("private-key.pem"))
        }

        val connexionLyt = findViewById<LinearLayout>(R.id.connexion_layout)
        connexionLyt.setOnClickListener {
            connexionLyt.visibility = View.GONE
            batteryLyt.visibility = View.VISIBLE
        }

        val trunkBt = findViewById<ImageView>(R.id.trunk)
        trunkBt.setOnClickListener {
            if (trunkBt.alpha.equals(0.5F)) {
                trunkBt.alpha = 1F
            } else {
                trunkBt.alpha = 0.5F
            }
        }

        val lockBt = findViewById<ImageView>(R.id.lock)
        lockBt.setOnClickListener {
            if (lockBt.alpha.equals(0.5F)) {
                lockBt.alpha = 1F
                lockBt.setImageDrawable(ResourcesCompat.getDrawable(resources, R.drawable.ic_unlock, null))
            } else {
                lockBt.alpha = 0.5F
                lockBt.setImageDrawable(ResourcesCompat.getDrawable(resources, R.drawable.ic_lock, null))
            }
        }

        val frunkBt = findViewById<ImageView>(R.id.frunk)
        frunkBt.setOnClickListener {
            if (frunkBt.alpha.equals(0.5F)) {
                 run("https://google.com", { frunkBt.alpha = 1F })
            } else {
                frunkBt.alpha = 0.5F
            }
        }

        val climBt = findViewById<ImageView>(R.id.clim)
        climBt.setOnClickListener {
            if (climBt.alpha.equals(0.5F)) {
                climBt.alpha = 1F
            } else {
                climBt.alpha = 0.5F
            }
        }

        val windowBt = findViewById<ImageView>(R.id.window)
        windowBt.setOnClickListener {
            if (windowBt.alpha.equals(0.5F)) {
                windowBt.alpha = 1F
            } else {
                windowBt.alpha = 0.5F
            }
        }
    }

    fun run(url: String, callback: () -> Unit) {
        val request = Request.Builder()
            .url(url)
            .build()

        client.newCall(request).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) { println(e.message) }
            override fun onResponse(call: Call, response: Response) = callback()
        })
    }
}
