package com.example.a04shoppinglist.domain

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopItemUseCase(shopItem: ShopItem){
        shopListRepository.editShopItemUseCase(shopItem)
    }
}