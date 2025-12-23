package crud.basico.crud_basico.exceptions;

public class ErrorResponse {
    private String campo;
    private String mensaje;

    public ErrorResponse(String campo, String mensaje) {
        this.campo = campo;
        this.mensaje = mensaje;
    }

    public String getCampo() {
        return campo;
    }

    public String getMensaje() {
        return mensaje;
    }

}
