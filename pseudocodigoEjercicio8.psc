Algoritmo pseudocodigoEjercicio8
	Mientras salir<>"s" Hacer
		Repetir
			num_random<-1+azar(100)
		Hasta Que num_random MOD 5=0
		Escribir "El numero ",num_random," es multiplo de 5"
		
		Escribir "Desea salir presione s"
		Leer salir
	Fin Mientras
FinAlgoritmo
