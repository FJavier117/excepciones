package exceptionP;

public class ErrorFisicoException extends Exception
{
    public ErrorFisicoException(Exception ex)
    {
        super("Ocurrio un Error Fisico",ex);
    }
}

