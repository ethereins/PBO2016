package model;

public class Service {
    private String id;
    private String jenis;
    private String status;
    private long harga; 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getHarga() { 
        return harga;
    }

    public void setHarga(long harga) { 
        this.harga = harga;
    }
}
