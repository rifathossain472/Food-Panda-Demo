package com.esports.darazdemo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.esports.darazdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val product = listOf<ItemData>(
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "Pizza"
        ),
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "Halim"
        ),
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "Burger"
        ),
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "Chicken"
        ),
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "Pizza"
        ),
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "Halim"
        ),
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "Burger"
        ),
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "Chicken"
        ),
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "Pizza"
        ),
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "Halim"
        ),
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "Burger"
        ),
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "Chicken"
        )
    )

    private val product2 = listOf<ItemData>(
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "Groceries"
        ),
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "Convenience"
        ),
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "Health"
        ),
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "Pets"
        ),
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "Beauty"
        ),
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "Electronics"
        )
    )

    private val product3 = listOf<ItemData>(
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "Agora", "20-35 min"
        ),
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "pandamart", "20-35 min"
        ),
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "RFL", "20-35 min"
        ),
        ItemData(
            "https://img.freepik.com/premium-psd/burgur-minimal-3d_252008-1942.jpg",
            "Meena Bazar", "20-35 min"
        )
    )

    private val product4 = listOf<ItemData2>(
        ItemData2(
            "Food Chemistry",
            "Fast Food",
            "30-40",
            "55",
            "https://www.cozi.com/wp-content/uploads/2015/05/BeefOrzoSkillet580.jpg",
            "50% Off"
        ),
        ItemData2(
            "Kabab Masal",
            "Kabab",
            "30-50",
            "10",
            "https://www.cozi.com/wp-content/uploads/2015/05/BeefOrzoSkillet580.jpg",
            "30% Off"
        ),ItemData2(
            "Chicken Rice",
            "Dinning",
            "30-40",
            "100",
            "https://www.cozi.com/wp-content/uploads/2015/05/BeefOrzoSkillet580.jpg",
            "35% Off"
        ),
        ItemData2(
            "Chicken Biryani",
            "Dinning",
            "20-30",
            "68",
            "https://www.cozi.com/wp-content/uploads/2015/05/BeefOrzoSkillet580.jpg",
            "15% Off"
        ),
        ItemData2(
            "Spicy Momo",
            "Street Food",
            "40-45",
            "45",
            "https://www.cozi.com/wp-content/uploads/2015/05/BeefOrzoSkillet580.jpg",
            "23% Off"
        ),
        ItemData2(
            "Beef Kabab",
            "Fast Food",
            "35-40",
            "65",
            "https://www.cozi.com/wp-content/uploads/2015/05/BeefOrzoSkillet580.jpg",
            "25% Off"
        ),
        ItemData2(
            "Mattan Biryani",
            "Spicy",
            "55-65",
            "66",
            "https://www.cozi.com/wp-content/uploads/2015/05/BeefOrzoSkillet580.jpg",
            "29% Off"
        ),
    )

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: Adapter
    private lateinit var adapter2: Adapter
    private lateinit var adapter3: Adapter
    private lateinit var adapter4: Adapter2
    private lateinit var adapter5: Adapter3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = Adapter(product)
        binding.rvLayout.adapter = adapter

        adapter2 = Adapter(product2)
        binding.rvLayout2.adapter = adapter2

        adapter3 = Adapter(product3)
        binding.rvLayout3.adapter = adapter3

        adapter4 = Adapter2(product4)
        binding.rvLayout4.adapter = adapter4

        adapter5 = Adapter3(product4)
        binding.rvLayout5.adapter = adapter5




    }
}