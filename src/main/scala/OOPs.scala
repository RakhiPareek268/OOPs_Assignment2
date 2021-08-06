class Person(var name: String, var age: Int) extends Ordered[Person] {
  def compare(that: Person): Int = {
    this.name compare that.name match {
      case 0 => {
        if (this.age.equals(that.age))
          println("True\nNames & age both are same")
        else
          println("False\nNames are same but age are not same");
        0
      }
      case other => {
        if (this.name.length.equals(that.name.length) && this.age.equals(that.age))
          println("True");
        else
          println("False");
        1
      }
    }
  }
}

object Person extends App {
  var personOne = new Person("Rakhi", 22)
  var personTwo = new Person("Nehaa", 22)
  personOne compare personTwo
}