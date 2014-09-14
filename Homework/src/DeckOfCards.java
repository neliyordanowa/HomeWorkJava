import java.io.FileOutputStream;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class DeckOfCards {
	public static void main(String[] args) {
		
		Document cardsPDF=new Document();
	
		try {
			PdfWriter.getInstance(cardsPDF,new FileOutputStream("Deck-of-Cards.pdf"));
			cardsPDF.open();
			//create Table:
			PdfPTable table = new PdfPTable(4);
			table.setWidthPercentage(100F);
			table.getDefaultCell().setFixedHeight(100F);
			
			BaseFont baseFont = BaseFont.createFont("arial.ttf", BaseFont.IDENTITY_H, true);
			
			Font black=new Font(baseFont,70F,0,BaseColor.BLACK);
			Font red=new Font(baseFont,70F,0,BaseColor.RED);
			
			//Initialize cards:
			String card="";
			String face = "";
			char type=' ';
			for (int i = 2; i <= 14; i++) {
				switch (i) {
				case 11:
					face = "J";
					break;
				case 12:
					face =  "Q";
					break;
				case 13:
					face = "K";
					break;
				case 14:
					face = "A";
					break;
				default:
					face = i+"";
					break;
				}
				
				//Type of the card:
				for (int j = 1; j <=4; j++) {
					switch (j) {
					case 1:
						type ='\u2663';					
						break;
					case 2:
						type = '\u2666';					
						break;
					case 3:
						type= '\u2665';					
						break;
					case 4:
						type='\u2660';					
						break;
					}
					
					card = face + type;
					//set color of the card:
					if (j==1||j==4) {
						table.addCell(new Paragraph(card, black));
						
					} else if (j==2 ||j==3){
						table.addCell(new Paragraph(card, red));
					}
					
					
			}
			
			
			
		}
			//insert the table in the document:
			cardsPDF.add(table);
			cardsPDF.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
