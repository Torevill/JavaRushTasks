package com.javarush.task.task16.task1631;


import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    static ImageReader answer;
    public static ImageReader getImageReader(ImageTypes type){
        if (type == ImageTypes.BMP){
            answer = new BmpReader();
        }
        else if (type == ImageTypes.PNG){
            answer = new PngReader();
        }
        else if (type == ImageTypes.JPG){
            answer = new JpgReader();
        }
        else{
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }
        return answer;
    }
}
