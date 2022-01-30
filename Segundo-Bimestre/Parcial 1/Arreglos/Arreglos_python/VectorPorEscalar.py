print("")
# Inicializar las variables
i = 0; n = 0; escalar = 0

# Ingreso de datos
n = int(input("Ingrese el tamaño del vector: "))

# Declarar los vectores
A = [None]*n
B = [None]*n

escalar = int(input("Ingrese el escalar: "))

# Ingresar los elementos del vector
for i in range (0, n):
    A[i] = int(input("Ingrese el elemento A["+str(i)+"]: "))

# Multiplicar por el escalar
for i in range (0, n):
    B[i] = A[i]*escalar

# Presentar el vector B
for i in range (0, n):
    print("B ["+str(i)+"] = ",B[i])
