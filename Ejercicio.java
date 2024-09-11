public class Ejercicio {
    float SalarioIncial;
    float porcentajeAumento;
    float SalarioFinal;

    public Ejercicio (float SalarioIncial, float porcentajeAumento, float SalarioFinal){
        this.SalarioIncial = SalarioIncial;
        this.porcentajeAumento = porcentajeAumento;
        this.SalarioFinal = SalarioFinal;
    }

    public float calcularSalario(){
        if (SalarioIncial<1300606) {
            SalarioFinal = SalarioIncial+(SalarioIncial*porcentajeAumento);
        } else {
            SalarioFinal = SalarioIncial;
        }

        return SalarioFinal;


    }




}