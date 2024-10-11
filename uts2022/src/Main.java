public class Main {
    public static void main(String[] args) {
        // soal nomor 1
        // for(int i = 0; i < 39; i++){
        //     System.out.print("Pada saat ini= " + i + ": ");
        //     for(int j = 0; j < 39; j++) {
        //         if(j == 20) {
        //             continue;
        //         }
        //         System.out.print(j + "");
        //     }
        //     System.out.println();
        // }
        
        // soal 2
        int choose = 2;
        switch(choose){
            case 1: System.out.println("Pilihan 1 Bidik Misi: FK");
                break;
            case 2: System.out.println("Pilihan 2 Bidik Misi: Tekkom");
                break;
            case 3: System.out.println("Pilihan 3: Statistika");
                break;
            case 4: System.out.println("Pilihan 4 SBMPTN: FKG");
                break;
            case 5: System.out.println("Pilihan 5 SBMPTN: Teknik Elektro");
                break;
            case 6: System.out.println("Anda tidak memilih");
        }

        // soal 3
        int n = 10;
        int hasil = 0;
        for(int i = 1; i <= n; i++) {
            hasil += i;
            if(i != n) {
                System.out.print(i + "+");
            } else {
                System.out.print("= ");
            }
        }
        System.out.println(hasil); // output 1 + 2 + 3 + n + = n+=1

        // soal 4 (3 baris 5 kolom)
        int[][] duadD = {
            {11, 12, 13, 14, 15},
            {22, 23, 24, 25, 26},
            {33, 34, 35, 36, 37}
        };
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++){
                System.out.print(duadD[i][j]);
                if(j < 5) System.out.print(" "); //buat spasi
            }
            System.out.println(); // buat baris baru
        }

        // soal 5
        String S1 = "Varry";
        String S2 = "21120122130062";
        String S3 = "2022";
        // 5a
        String StringTotalS = S1+S2+S3;
        System.out.println(StringTotalS);
        // 5b
        System.out.println(StringTotalS.length());
        // 5C
        String convert = S1.replace("a", "o");
        System.out.println(convert);
        // 5D
        System.out.println((S1+S3).toUpperCase());
        // 5E
        System.out.println((S1+S3).toLowerCase());

        // bisa pake concat
        String S2concat = S1.concat(S2);
        System.out.println(S2concat);

        int perhitungan = 10;
        while(perhitungan == 10){
            for(int i = 1; i < perhitungan + 1; i++) {
                System.out.println("Konversi " + i + " celcius " + "to " + ((i * 9/5) +32) + "Fahrenheit");
            }
            perhitungan++;
        }

        Laptop laptop = new Laptop("Intel i7", "Dell", 16, 10);
        Desktop desktop = new Desktop("AMD Ryzen 9", "HP", 32, true);
        PersonalKomputer personalKomputer = new PersonalKomputer("Intel i5", "Acer", 8, 512);
        Server server = new Server("Intel Xeon", "IBM", 64, 4);

        // Menampilkan spesifikasi masing-masing perangkat
        laptop.displaySpecs();
        System.out.println();  // Blank line
        desktop.displaySpecs();
        System.out.println();  // Blank line
        personalKomputer.displaySpecs();
        System.out.println();  // Blank line
        server.displaySpecs();

    }
}


// soal 5
// Abstract class Komputer
abstract class Komputer {
    protected String processor;
    protected String merk;
    protected int memory;

    public Komputer(String processor, String merk, int memory) {
        this.processor = processor;
        this.merk = merk;
        this.memory = memory;
    }

    // Abstract method
    public abstract void displaySpecs();
}

// Kelas turunan Laptop
class Laptop extends Komputer {
    private int batteryLife; // Atribut tambahan untuk Laptop

    public Laptop(String processor, String merk, int memory, int batteryLife) {
        super(processor, merk, memory);
        this.batteryLife = batteryLife;
    }

    @Override
    public void displaySpecs() {
        System.out.println("Laptop:");
        System.out.println("Processor: " + processor);
        System.out.println("Merk: " + merk);
        System.out.println("Memory: " + memory + "GB");
        System.out.println("Battery Life: " + batteryLife + " hours");
    }
}

// Kelas turunan Desktop
class Desktop extends Komputer {
    private boolean hasGpu; // Atribut tambahan untuk Desktop

    public Desktop(String processor, String merk, int memory, boolean hasGpu) {
        super(processor, merk, memory);
        this.hasGpu = hasGpu;
    }

    @Override
    public void displaySpecs() {
        System.out.println("Desktop:");
        System.out.println("Processor: " + processor);
        System.out.println("Merk: " + merk);
        System.out.println("Memory: " + memory + "GB");
        System.out.println("Has GPU: " + (hasGpu ? "Yes" : "No"));
    }
}

// Kelas turunan PersonalKomputer
class PersonalKomputer extends Komputer {
    private int storage; // Atribut tambahan untuk PersonalKomputer

    public PersonalKomputer(String processor, String merk, int memory, int storage) {
        super(processor, merk, memory);
        this.storage = storage;
    }

    @Override
    public void displaySpecs() {
        System.out.println("Personal Komputer:");
        System.out.println("Processor: " + processor);
        System.out.println("Merk: " + merk);
        System.out.println("Memory: " + memory + "GB");
        System.out.println("Storage: " + storage + "GB");
    }
}

// Kelas turunan Server
class Server extends Komputer {
    private int rackUnits; // Atribut tambahan untuk Server

    public Server(String processor, String merk, int memory, int rackUnits) {
        super(processor, merk, memory);
        this.rackUnits = rackUnits;
    }

    @Override
    public void displaySpecs() {
        System.out.println("Server:");
        System.out.println("Processor: " + processor);
        System.out.println("Merk: " + merk);
        System.out.println("Memory: " + memory + "GB");
        System.out.println("Rack Units: " + rackUnits + "U");
    }
}


