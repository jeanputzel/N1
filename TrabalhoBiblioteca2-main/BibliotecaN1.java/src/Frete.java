public class Frete {

    // VARIAVEIS
    private int parcelas;
    private String estado;
    
      
        public void setParcelas(int parcelas) {
            this.parcelas = parcelas;
        }
        public int getParcelas() {
            return parcelas;
        }
        public void setEstado(String estado) {
            this.estado = estado;
        }
        public String getEstado() {
            return estado;
        }

        public String toString() {
            return 
                   this.parcelas + "\n" +                                             
                   this.estado + "\n";                 
                  
        }

    }