Algoritmo MayorDigi
	// Definir e inicializar las variables
	Definir n,i,nd,mayor,aux Como Entero
	n <- 0; nd <- 0; mayor <- 0; aux <- 0
	// Solicitar el tamaño del vector
	Escribir 'Ingrese el tamaño del vector: ' Sin Saltar
	Leer n
	// Declarar el vector
	Dimension A[n]
	// Ingresar los datos del vector
	Para i<-1 Hasta n Hacer
		Escribir 'Ingrese el elemento A[',i,']' Sin Saltar
		Leer A[i]
	FinPara
	// #Determinar el número de digitos de cada valor almacenado
	Para i<-1 Hasta n Hacer
		Si (A[i]<0) Entonces
			A[i] <- -A[i]
		FinSi
		Si (A[i]==0) Entonces
			nd <- 1
		FinSi
		nd <- 0
		Mientras (A[i]>0) Hacer
			A[i] <- trunc(A[i]/10)
			nd <- nd+1
		FinMientras
		Escribir 'A[',i,'] tiene ',nd,' digitos'
		Si (nd>mayor) Entonces
			mayor <- nd
			aux <- i
		FinSi
	FinPara
	Escribir 'El número con mayor cantidad de dígitos se encuentra en la posición A[',aux,']'
FinAlgoritmo
