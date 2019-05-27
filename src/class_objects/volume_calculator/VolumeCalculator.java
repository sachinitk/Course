package class_objects.volume_calculator;

public class VolumeCalculator {
    double calculateVolume(double radius, double height){
        double volume;
        volume = 3.14*radius*radius*height;
        return volume;
    }
    double calculateVolume(int length,int breadth , int height){
        return length*breadth*height;
    }
}
