Algoritmo Ejercicio4
	// Declarar e inicializar las variables
	Definir i,j,m,n Como Entero
	// Ingresar el tamaño de la matriz
	Escribir 'Ingrese el número de filas: ' Sin Saltar
	Leer m
	Escribir 'Ingrese el número de columnas: ' Sin Saltar
	Leer n
	Escribir ''
	// Declarar la matriz
	Dimension A[m,n]
	// Ingresar los elementos de la matriz A
	Escribir '***Ingrese los elementos de la matriz A***'
	Para i<-1 Hasta m Hacer
		Para j<-1 Hasta n Hacer
			Escribir 'A[',i,'][',j,'] = ' Sin Saltar
			Leer A[i,j]
		FinPara
	FinPara
	Escribir ''
	// Presentar la matriz original
	Escribir '***MATRIZ ORIGINAL***'
	Para i<-1 Hasta m Hacer
		Para j<-1 Hasta n Hacer
			Escribir A[i,j],'  ' Sin Saltar
		FinPara
		Escribir '  '
	FinPara
	Escribir ''
	// Voltear la matriz de izquierda a derecha
	Escribir '***MATRIZ VOLTEADA DE IZQUIERDA A DERECHA***'
	Para i<-1 Hasta m Hacer
		Para j<-n Hasta 1 Con Paso -1 Hacer
			Escribir A[i,j],'  ' Sin Saltar
		FinPara
		Escribir '  '
	FinPara
FinAlgoritmo
