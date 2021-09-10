package com.example.kekod_newsapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.kekod_newsapp.databinding.ActivityMainBinding
import com.example.kekod_newsapp.view.DetailFragment
import com.example.kekod_newsapp.view.FirstFragment
import com.example.kekod_newsapp.view.SecondFragment
import com.example.kekod_newsapp.view.ThirdFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private val fragmentOne= FirstFragment()
    private val fragmentTwo= SecondFragment()
    private val fragmentThree= ThirdFragment()
    private val fragmentFour=FirstFragment()
    private val fragmentFive=SecondFragment()
    private val fragmentSix=ThirdFragment()
    private val fragmentSeven=FirstFragment()
    private val fragmentEight=SecondFragment()
    private val fragmentNine=ThirdFragment()
    private val fragmentTen=FirstFragment()
    private val fragmentEleven=SecondFragment()
    private val fragmentTwelve=ThirdFragment()
    private val fragmentThirteen=FirstFragment()
    private val fragmentFourteen=SecondFragment()
    private val fragmentFifteen=ThirdFragment()
    private val fragmentDetail= DetailFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        addAllFragments()
    }

    private fun removeAllFragments() {
        supportFragmentManager.beginTransaction().remove(fragmentOne).commit()
        supportFragmentManager.beginTransaction().remove(fragmentTwo).commit()
        supportFragmentManager.beginTransaction().remove(fragmentThree).commit()
        supportFragmentManager.beginTransaction().remove(fragmentFour).commit()
        supportFragmentManager.beginTransaction().remove(fragmentFive).commit()
        supportFragmentManager.beginTransaction().remove(fragmentSix).commit()
        supportFragmentManager.beginTransaction().remove(fragmentSeven).commit()
        supportFragmentManager.beginTransaction().remove(fragmentEight).commit()
        supportFragmentManager.beginTransaction().remove(fragmentNine).commit()
        supportFragmentManager.beginTransaction().remove(fragmentTen).commit()
        supportFragmentManager.beginTransaction().remove(fragmentEleven).commit()
        supportFragmentManager.beginTransaction().remove(fragmentTwelve).commit()
        supportFragmentManager.beginTransaction().remove(fragmentThirteen).commit()
        supportFragmentManager.beginTransaction().remove(fragmentFourteen).commit()
        supportFragmentManager.beginTransaction().remove(fragmentFifteen).commit()
    }

    private fun addAllFragments() {
        supportFragmentManager.beginTransaction().add(binding.frameLayoutOne.id, fragmentOne).commit()
        supportFragmentManager.beginTransaction().add(binding.frameLayoutTwo.id, fragmentTwo).commit()
        supportFragmentManager.beginTransaction().add(binding.frameLayoutThree.id, fragmentThree).commit()
        supportFragmentManager.beginTransaction().add(binding.frameLayoutFour.id, fragmentFour).commit()
        supportFragmentManager.beginTransaction().add(binding.frameLayoutFive.id, fragmentFive).commit()
        supportFragmentManager.beginTransaction().add(binding.frameLayoutSix.id, fragmentSix).commit()
        supportFragmentManager.beginTransaction().add(binding.frameLayoutSeven.id, fragmentSeven).commit()
        supportFragmentManager.beginTransaction().add(binding.frameLayoutEight.id, fragmentEight).commit()
        supportFragmentManager.beginTransaction().add(binding.frameLayoutNine.id, fragmentNine).commit()
        supportFragmentManager.beginTransaction().add(binding.frameLayoutTen.id, fragmentTen).commit()
        supportFragmentManager.beginTransaction().add(binding.frameLayoutEleven.id, fragmentEleven).commit()
        supportFragmentManager.beginTransaction().add(binding.frameLayoutTwelve.id, fragmentTwelve).commit()
        supportFragmentManager.beginTransaction().add(binding.frameLayoutThirteen.id, fragmentThirteen).commit()
        supportFragmentManager.beginTransaction().add(binding.frameLayoutFourteen.id, fragmentFourteen).commit()
        supportFragmentManager.beginTransaction().add(binding.frameLayoutFifteen.id, fragmentFifteen).commit()
    }

    fun goToDetailPage(view: View) {
        supportFragmentManager.beginTransaction().replace(binding.frameLayoutDetail.id, fragmentDetail).commit()
        removeAllFragments()
    }

    override fun onBackPressed() {
        supportFragmentManager.beginTransaction().remove(fragmentDetail).commit()
        addAllFragments()
    }

}