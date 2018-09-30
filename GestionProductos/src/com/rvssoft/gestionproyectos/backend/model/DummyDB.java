package com.rvssoft.gestionproyectos.backend.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DummyDB {

	private static final Map<Integer, Producto> MAPA_PRODUCTOS = new HashMap<>();

	static {

		String strFecha1 = "10/12/2014";
		String strFecha2 = "11/12/2014";
		String strFecha3 = "12/12/2014";
		String strFecha4 = "13/12/2014";
		String strFecha5 = "14/12/2014";

		Date fecha1 = null;
		Date fecha2 = null;
		Date fecha3 = null;
		Date fecha4 = null;
		Date fecha5 = null;

		SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");

		try {
			fecha1 = sdt.parse(strFecha1);
			fecha2 = sdt.parse(strFecha1);
			fecha3 = sdt.parse(strFecha1);
			fecha4 = sdt.parse(strFecha1);
			fecha5 = sdt.parse(strFecha1);

		} catch (Exception e) {
			System.out.println("Mensaje : " + e.getMessage());
		}

		Producto p1 = new Producto();
		
		
	}

}
