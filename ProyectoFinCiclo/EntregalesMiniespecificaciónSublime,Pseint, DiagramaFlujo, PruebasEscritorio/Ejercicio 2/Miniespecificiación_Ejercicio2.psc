Algoritmo Ejercicio2
	// Declarar e inicializar las variables
	Definir n,i,j,k,l Como Entero
	Definir dig,suma,prom,Pdec Como Real
	n <- 5; prom <- 0; dig <- 0; suma <- 0; k <- 0; l <- 0; Pdec <- 0
	// Declarar las matrices
	Dimension A[n,n]
	Dimension B[n,n]
	// Ingresar los elementos de la matriz A
	Escribir '***Ingrese los elementos de la matriz A***'
	Para i<-1 Hasta n Hacer
		Para j<-1 Hasta n Hacer
			Escribir 'A[',i,'][',j,'] = ' Sin Saltar
			Leer A[i,j]
		FinPara
	FinPara
	// Ingresar los elementos de la matriz B
	Escribir '***Ingrese los elementos de la matriz B***'
	Para i<-1 Hasta n Hacer
		Para j<-1 Hasta n Hacer
			Escribir 'B[',i,'][',j,'] = ' Sin Saltar
			Leer B[i,j]
		FinPara
	FinPara
	// Mostrar la matriz A
	Escribir '***MATRIZ A***'
	Para i<-1 Hasta n Hacer
		Para j<-1 Hasta n Hacer
			Escribir A[i,j],'  ' Sin Saltar
		FinPara
		Escribir '  '
	FinPara
	// Mostrar la matriz B
	Escribir '***MATRIZ B***'
	Para i<-1 Hasta n Hacer
		Para j<-1 Hasta n Hacer
			Escribir B[i,j],'  ' Sin Saltar
		FinPara
		Escribir '  '
	FinPara
	// Determinar cuáles números terminan en 4 y promedio de los mismos.
	Para i<-1 Hasta n Hacer
		Para j<-1 Hasta n Hacer
			dig <- A[i,j] MOD 10
			Si (dig=4) Entonces
				Escribir 'A[',i,'][',j,'] termina en 4'
				k <- k+1
				suma <- suma+A[i,j]
			FinSi
		FinPara
	FinPara
	prom <- suma/k
	Si (prom MOD 1<>0) Entonces
		Pdec <- prom MOD 1
		prom <- prom-Pdec
	FinSi
	Escribir 'El promedio de los números terminados en 4 es ',prom
	// Verificar si este promedio se repite al menos 3 veces en la matriz
	Para i<-1 Hasta n Hacer
		Para j<-1 Hasta n Hacer
			Si (B[i,j]=prom) Entonces
				l <- l+1
			FinSi
		FinPara
	FinPara
	Escribir 'El promedio ',prom,' se ha encontrado ',l,' veces en la matriz B'
	Si (l>=3) Entonces
		Escribir 'El promedio de los números terminados en 4 de la matriz A SÍ se repite al menos 3 veces'
	SiNo
		Escribir 'El promedio de los números terminados en 4 de la matriz A NO se repite al menos 3 veces'
	FinSi
FinAlgoritmo
