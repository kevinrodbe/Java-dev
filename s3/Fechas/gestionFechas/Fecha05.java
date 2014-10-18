package gestionFechas;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import beans.Producto;

public class Fecha05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Producto> data=new ArrayList<Producto>();
		Producto pro1=new Producto(100,"Producto1",45.0,"20/05/2015"),
				pro2=new Producto(101,"Producto1",75.0,"02/03/2013"),
				pro3=new Producto(102,"Producto1",25.0,"12/01/2015"),
				pro4=new Producto(103,"Producto1",95.0,"07/03/2013"),
				pro5=new Producto(104,"Producto1",200.0,"22/02/2015"),
				pro6=new Producto(105,"Producto1",65.0,"20/07/2013");
		data.add(pro1);data.add(pro2);data.add(pro3);data.add(pro4);
		data.add(pro5);data.add(pro6);
		for(Producto pro: data){
			System.out.println(pro.getCodigo()+"\t"+pro.getNombre()+"\t"+
							   pro.getPrecio()+"\t"+pro.getFechavencimiento());
		}
		//Proceso
		try {
			SimpleDateFormat f1=new SimpleDateFormat("dd/MM/yyyy");
			SimpleDateFormat f2=new SimpleDateFormat("yyyy");
			Date hoy=new Date();
			int con=0,can=0;
			for(Producto pro: data){
				String xfe=pro.getFechavencimiento();
				Date fecha=f1.parse(xfe);
				int xyear=Integer.parseInt(f2.format(fecha));
				if(hoy.after(fecha))
					con++;
				if(xyear==2015) 
					can++;
			}
			System.out.println("Cantidad de productos Vencidos : "+con);
			System.out.println("Cantidad de productos Vencen 2015 : "+can);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		

	}

}
