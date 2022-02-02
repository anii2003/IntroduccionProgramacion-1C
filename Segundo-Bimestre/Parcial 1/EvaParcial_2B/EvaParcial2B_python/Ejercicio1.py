from tkinter import N

print("")
# Inicializar las variables
n = 0; np = 0

# Ingresar los datos
n = int(input("Ingrese el tamaño del vector: "))

# Declarar el arreglo A e ingresar sus valores
A = [None]*n 

for i in range (0,n):
    A[i] = int(input("A["+str(i)+"]: "))

# Función esPar
def esPar(A, n):
    np = 0

    for i in range (0,n):
        if (A[i] % 2 == 0):
            np = np + 1
    
    return np

# Función esNeg
def esNeg(A, n):
    Nneg = 0

    for i in range (0,n):
        if (A[i]<0):
            Nneg = Nneg + 1

    return Nneg

# Función Primo
def Primo(A, n):
    Primo = 0; div = 0

    for i in range (0, n):
        for j in range (1, A[i]+1):
            if (A[i] % j == 0):
                div = div + 1

        if (div == 2):
            Primo = Primo + 1

        div = 0
    
    return Primo

np = esPar(A, n)
Nneg = esNeg(A, n)
Primo = Primo(A, n)

# Obtener los porcentajes
Pnp = (np*100)/n
Pneg = (Nneg*100)/n
Pprimo = (Primo*100)/n

print("")
print("Hay ",np," números pares que son el ",Pnp," del total de números")
print("Hay ",Nneg," números negativos que son el ",Pneg," del total de números")
print("Hay ",Primo," números primos que son el ",Pprimo," del total de números")

# Almacenar los valores pares en el vector PAR
def Vector_Par(A, n, np):
    # Declarar el vector PAR
    PAR = [None]*np
    j = 0

    for i in range (0,n):
        if (A[i] % 2 == 0):
            PAR[j] = A[i]
            j = j + 1

    # Presentar el vector PAR
    print("\n---VECTOR PAR---")
    for j in range (0, np):
        print("PAR ["+str(j)+"]: ",PAR[j])

# Almacenar los valores negativos en el vector NEG
def Vector_Neg(A, n, Nneg):
    # Declarar el vector NEG
    NEG = [None]*Nneg
    j = 0

    for i in range (0,n):
        if (A[i] < 0):
            NEG[j] = A[i]
            j = j + 1

    # Presentar el vector NEG
    print("\n---VECTOR NEG---")
    for j in range (0, Nneg):
        print("NEG ["+str(j)+"]: ",NEG[j])

# Almacenar los valores primos en el vector PRIMOS
def Vector_Primos(A, n, Primo):
    # Declarar el vector PRIMOS
    Primos = [None]*Primo
    k = 0; div = 0

    for i in range (0,n):
        for j in range (1, A[i]+1):
            if (A[i] % j == 0):
                div = div + 1

        if (div == 2):
            Primos[k] = A[i]
            k = k + 1
        
        div = 0

    # Presentar el vector PRIMOS
    print("\n---VECTOR PRIMO---")
    for k in range (0, Primo):
        print("PRIMO ["+str(k)+"]: ",Primos[k])

Vector_Par(A, n, np)
Vector_Neg(A, n,Nneg)
Vector_Primos(A, n, Primo)