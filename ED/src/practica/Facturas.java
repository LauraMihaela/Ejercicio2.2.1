package practica;

public class Facturas implements IFactura
{
	public int num;
	public float base;
	public float tipoIva;
	protected Estados estado;
	public static void main(String[] args) 
	{
		
	}
	@Override
	public void cambiarEstado(Estados estado) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public float getTotal() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public float getCantidadIva() {
		// TODO Auto-generated method stub
		return 0;
	}

}
