fun main(args: Array<String>) {
    println("Calculating the volume of a parallelepiped");

    //Inpud data
    print("Input length: ");
    val length = readln().toInt();
    print("Input width: ");
    val width = readln().toInt();
    print("Input height: ");
    val height = readln().toInt();

    //Output result
    var volume = length * width * height;
    println("The volume of the parallelepiped is $volume");
}