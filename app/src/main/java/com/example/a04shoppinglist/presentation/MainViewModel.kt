package com.example.a04shoppinglist.presentation

import androidx.lifecycle.ViewModel
import com.example.a04shoppinglist.data.ShopListRepositoryImpl
import com.example.a04shoppinglist.domain.DeleteShopItemUseCase
import com.example.a04shoppinglist.domain.EditShopItemUseCase
import com.example.a04shoppinglist.domain.GetShopListUseCase
import com.example.a04shoppinglist.domain.ShopItem

class MainViewModel: ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getShopList()

    fun deleteShopItem(shopItem: ShopItem){
        deleteShopItemUseCase.deleteShopItem(shopItem)
    }

    fun changeEnableStateShopItem(shopItem: ShopItem){
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopItemUseCase.editShopItem(newItem)
    }
}