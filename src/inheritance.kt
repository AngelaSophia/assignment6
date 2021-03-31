fun main ()  {
    var car=Car("Benze","Isuzu","white",8)
    car.carry(3)
    println("I am a ${car.color} ${car.make} ${car.modol}")
    car.identity()
    println(car.calculateParkingFee(2))

    var bus =Bus("Benze","BMW","red",5)
    println(bus.maxTripFare(5060.80.toDouble()))
    println(bus.maxTripFare(5060.80.toDouble()*bus.capacity))
    println(bus.calculateParkingFee(3))
}




        open class Matatu(var make:String,var modol:String,var color:String,var capacity:Int){
            fun carry(people:Int){
             var people=people-capacity
             if (people<=capacity){
                 println("carry $ people passangers")
             }else{
                 println("over capacity by $ people")
             }
            }
            open fun calculateParkingFee(hours:Int):Int{
                return hours*20
            }

            fun identity() {
                println("I am $color,$make,$modol")
            }


        }
class Car (make: String,modol: String,color: String,capacity: Int,):Matatu(make,modol,color,capacity){

}



    class Bus( make: String, modol: String,  color: String,  capacity: Int): Matatu(make,modol,color,capacity) {
        fun maxTripFare(fare: Double): Double {
            var y = 0
            return y + fare

        }

        override fun calculateParkingFee(hours: Int): Int
         {
            return hours * capacity
        }

    }




















