package model;

public class Customer {
    private String id, nama, alamat, noHp; 
    
    public Customer(String id, String nama, String alamat, String noHp) {
    	this.id = id;
    	this.nama = nama;
    	this.alamat = alamat;
    	this.noHp = noHp;
    }
   
        public String getId() {
            return id;
        }
        
        public void setId(String id) {
            this.id = id;
        }
        
        public String getNama() {
            return nama;
        }
        
        public void setNama(String nama) {
            this.nama = nama;
        }
      
        public String getAlamat() {
            return alamat;
        }
        
        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }
        
        public String getnoHp() { 
            return noHp; 
        }
        
        public void setnoHp(String noHp) { 
            this.noHp = noHp; 
    }
    
}