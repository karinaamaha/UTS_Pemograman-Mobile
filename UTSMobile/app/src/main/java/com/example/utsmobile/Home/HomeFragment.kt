package com.example.utsmobile.Home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.utsmobile.Adapter.CategoryAdapter
import com.example.utsmobile.Adapter.GoalAdapter
import com.example.utsmobile.Category
import com.example.utsmobile.Goal
import com.example.utsmobile.R
import com.example.utsmobile.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    private val listGoal = ArrayList<Goal>()
    private val listCategory = ArrayList<Category>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.categoryrecycler.setHasFixedSize(true)
        binding.goalrecycler.setHasFixedSize(true)

        listGoal.addAll(getListGoal())
        showRecyclerGoal()

        listCategory.addAll(getListCategory())
        showRecyclerCategory()

        return binding.root

    }
    private fun showRecyclerGoal() {
        binding.goalrecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val listGoalAdapter = GoalAdapter(listGoal)
        binding.goalrecycler.adapter = listGoalAdapter
    }
    private fun getListGoal(): ArrayList<Goal> {
            val dataName = resources.getStringArray(R.array.goal_title)
            val listGoal = ArrayList<Goal>()
            for (i in dataName.indices) {
                val goal = Goal(dataName[i])
                listGoal.add(goal)
            }
            return listGoal
        }
    private fun showRecyclerCategory() {
        binding.categoryrecycler.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        val listCategoryAdapter = CategoryAdapter(listCategory)
        binding.categoryrecycler.adapter = listCategoryAdapter
    }

    private fun getListCategory(): Collection<Category> {
        val dataPhoto = resources.obtainTypedArray(R.array.category_photo)
        val dataTitle = resources.getStringArray(R.array.category_title)

        val listCategory = ArrayList<Category>()
        for(i in dataTitle.indices){
            val category = Category(dataPhoto.getResourceId(i, -1), dataTitle[i])
            listCategory.add(category)
        }
        return listCategory
    }

}