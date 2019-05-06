import net.sourceforge.tess4j.Tesseract;

import java.io.File;

public class OCRReader {
    public static void main(String [] args) throws Exception{
        String inputFilePath = "CCITT_1.TIF";
        Tesseract tesseract = new Tesseract();
       // tesseract.setDatapath("/Users/i318862/OCR/eng.traineddata");
        String fullText = tesseract.doOCR(new File(inputFilePath));
        System.out.println(fullText);

    }
}
