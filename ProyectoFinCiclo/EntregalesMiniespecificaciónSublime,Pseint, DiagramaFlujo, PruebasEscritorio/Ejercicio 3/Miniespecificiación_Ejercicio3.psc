Algoritmo Ejercicio3
	// Declarar e inicializar las variables
	Definir n,i,aux Como Entero
	n <- 10; aux <- 0
	// Declarar el vector
	Dimension A[n]
	// Ingresar los datos del vector
	Escribir '***Función para determinar la posición del número con mayor número de dígitos***'
	Para i<-1 Hasta n Hacer
		Escribir 'Ingrese el elemento A[',i,']' Sin Saltar
		Leer A[i]
	FinPara
	// Crear la función y asignarle un valor
	aux <- Pos_Mdig(A,n)
	Escribir ''
	Escribir 'El número con mayor cantidad de dígitos se encuentra en la posición A[',aux,']'
	Escribir ''
FinAlgoritmo

Funcion aux <- Pos_Mdig(A,n)
	Definir i,nd,mayor,aux Como Entero
	nd <- 0; mayor <- 0; aux <- 0
	// Determinar el número de cifras de cada valor almacenado
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
		Si (nd>mayor) Entonces
			mayor <- nd
			aux <- i
		FinSi
	FinPara
FinFuncion
