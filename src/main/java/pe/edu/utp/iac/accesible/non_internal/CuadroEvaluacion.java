package pe.edu.utp.iac.accesible.non_internal;

public class CuadroEvaluacion {
    public int pc1;
    public int pc2;
    public int pc3;
    public int ef;
    public float peso_pc1;
    public float peso_pc2;
    public float peso_pc3;
    public float peso_ef;

    public int promedio(){
        return (int) ((pc1*peso_pc1)
                +(pc2*peso_pc2)
                +(pc3*peso_pc3)
                +(ef*peso_ef));
    }

    public CuadroEvaluacion(int pc1, int pc2, int pc3, int ef, float peso_pc1, float peso_pc2, float peso_pc3, float peso_ef) {
        this.pc1 = pc1;
        this.pc2 = pc2;
        this.pc3 = pc3;
        this.ef = ef;
        this.peso_pc1 = peso_pc1;
        this.peso_pc2 = peso_pc2;
        this.peso_pc3 = peso_pc3;
        this.peso_ef = peso_ef;
    }

    public int getPc1() {
        return pc1;
    }

    public void setPc1(int pc1) {
        this.pc1 = pc1;
    }

    public int getPc2() {
        return pc2;
    }

    public void setPc2(int pc2) {
        this.pc2 = pc2;
    }

    public int getPc3() {
        return pc3;
    }

    public void setPc3(int pc3) {
        this.pc3 = pc3;
    }

    public int getEf() {
        return ef;
    }

    public void setEf(int ef) {
        this.ef = ef;
    }

    public float getPeso_pc1() {
        return peso_pc1;
    }

    public void setPeso_pc1(float peso_pc1) {
        this.peso_pc1 = peso_pc1;
    }

    public float getPeso_pc2() {
        return peso_pc2;
    }

    public void setPeso_pc2(float peso_pc2) {
        this.peso_pc2 = peso_pc2;
    }

    public float getPeso_pc3() {
        return peso_pc3;
    }

    public void setPeso_pc3(float peso_pc3) {
        this.peso_pc3 = peso_pc3;
    }

    public float getPeso_ef() {
        return peso_ef;
    }

    public void setPeso_ef(float peso_ef) {
        this.peso_ef = peso_ef;
    }


}
