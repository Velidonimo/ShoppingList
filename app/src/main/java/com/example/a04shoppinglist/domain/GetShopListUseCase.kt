package com.example.a04shoppinglist.domain

class GetShopListUseCase (private val shopListRepository: ShopListRepository) {

    fun getShopList(): List<ShopItem>{
        return shopListRepository.getShopList()
    }

}