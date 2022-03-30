public class Main {
    public static void main(String[] args) {

        FictionBook[] fictionBooks = new FictionBook[5];
        System.out.println();
        fictionBooks[0] = new FictionBook("Long121","Harry Potter vs Codegym", 50.0,"LongMaster","Thần Thoại");
        fictionBooks[1] = new FictionBook("Long122","Harry Potter vs AnhChinh", 40.0,"LongMaster","THài Comedy");
        fictionBooks[2] = new FictionBook("Long123","Harry Potter vs ChiHue", 30.0,"LongMaster","Trinh Thám");
        fictionBooks[3] = new FictionBook("Long124","Harry Potter vs AnhHung", 25.0,"LongMaster","Cửu DƯơng Thần Công");
        fictionBooks[4] = new FictionBook("Long125","Harry Potter vs KtsKhoa", 10.0,"LongMaster","Phàm Nhân Tu Tiên");

        System.out.println("List of FictionBooks");
        System.out.println();
        for (FictionBook books: fictionBooks) {
            System.out.println(books);
        }
        System.out.println();
        System.out.println();

        ProgramingBook[] programingBooks = new ProgramingBook[5];
        programingBooks[0] = new ProgramingBook("Hue121","Java Beginner",120.0,"HueDev","Java","Angular");
        programingBooks[1] = new ProgramingBook("Hue122","Javascript Beginner",100.0,"HueDev","Javascript","Spring");
        programingBooks[2] = new ProgramingBook("Hue123","Python Master",110.0,"HueDev","Python","Grails");
        programingBooks[3] = new ProgramingBook("Hue124","Java Immediate",60.0,"HueDev","Java","GWT");
        programingBooks[4] = new ProgramingBook("Hue125","Ruby 2",75.0,"HueDev","Ruby","vueJs");

        SumOfPricesOfAllOfBooks(fictionBooks, programingBooks);

        NumbersOfJavaBooks(programingBooks);


    }

    private static void NumbersOfJavaBooks(ProgramingBook[] programingBooks) {
        int sumOfJavaProgramingBooks = 0;
        for (ProgramingBook books: programingBooks) {
            if (books.language.equals("Java")) {
                sumOfJavaProgramingBooks ++;
            }
        }
        System.out.println();
        System.out.println("Number of books named [Java] is: "+sumOfJavaProgramingBooks);
    }

    private static void SumOfPricesOfAllOfBooks(FictionBook[] fictionBooks, ProgramingBook[] programingBooks) {
        System.out.println("List of ProgramingBooks ");
        System.out.println();
        for (ProgramingBook programings : programingBooks) {
            System.out.println(programings);
        }

        double sumPriceOfFictionsBooks = 0;
        for (FictionBook books: fictionBooks) {
            sumPriceOfFictionsBooks += books.price;
        }
        System.out.println();
        System.out.println("The total prices of all Fiction books are: " + sumPriceOfFictionsBooks);

        double sumPriceOfProgramingBooks = 0;
        for (ProgramingBook books: programingBooks) {
            sumPriceOfProgramingBooks += books.price;
        }
        System.out.println();
        System.out.println("The total prices of all Programing books are: " + sumPriceOfProgramingBooks);

        System.out.println();
        System.out.println("...Then, the total prices for all of books are: " + (sumPriceOfProgramingBooks + sumPriceOfFictionsBooks));
    }
}
