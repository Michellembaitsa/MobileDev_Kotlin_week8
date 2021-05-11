fun main(){
println(isEven(33))
    println(isEven(20))
   println(indices("Ruby"))
    println(indices("Perpendicular"))
    println(indices("programming"))
    shopping(Products("Milk",14.75,50.50,"Grocery"))
    shopping(Products("Bathing Soap",1.45,100.00,"Hygiene"))
    println(strLength(arrayOf("Harare","Denmark","Singapore","Juba land","Beth","Toms")))

}
fun isEven(number:Int):Boolean{  //question1
    if(number%2==0){
        return true
    }
    return false
}


data class Products(var name:String,var weight:Double,var price:Double,var category:String) //question2
fun shopping(products:Products){
    var groceriesList=mutableListOf<Products>()
    var hygieneList= mutableListOf<Products>()
    var otherList= mutableListOf<Products>()
    when(products.category){
        "groceries"->groceriesList.add(products)
        "hygiene"->hygieneList.add(products)
        else->otherList.add(products)
    }
    println(groceriesList)
    println(groceriesList)
    println(otherList)
}
fun indices(trait:String):String{ //question3
    var characteristic=" "
    trait.forEachIndexed{index,character ->
        if(index %2==0 ){
            characteristic+=character
        }
    }
    return characteristic
}
fun strLength(name:Array<String>):List<String> { //question4
    var names = mutableListOf<String>()
    //var length=0
    for (item in name) {
        if (item.length % 2 == 0) {
            names.add(item)
        }

    }
    return names
}