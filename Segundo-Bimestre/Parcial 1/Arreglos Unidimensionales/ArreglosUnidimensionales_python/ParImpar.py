print("")
# Inicializar las variables
i = 0; n = 0; np = 0; ni = 0; j = 0

# Ingresar los datos
n = int(input("Ingrese el límite de números a evaluar: "))

# Declarar el vector
A = [None]*n

for i in range (0, n):
    A[i] = int(input("Ingrese el elemento A["+str(i)+"]: "))

    if (A[i] % 2 == 0):
        np = np + 1
    else:
        ni = ni + 1

# Presentar cada elemento de A
print("---VECTOR A---")
for i in range (0, n):
    print("A["+str(i)+"]: ",A[i])

# Declarar el vector Par y el vector Impar
Par = [None]*np
Impar = [None]*ni

# Establecer datos de los vectores
for i in range (0, n):
    if (A[i] % 2 == 0):
        Par[j] = A[i]
        j = j + 1
j = 0

for i in range (0, n):
    if (A[i] % 2 != 0):
        Impar[j] = A[i]
        j = j + 1

# Presentar el vector Par
print("---VECTOR PAR---")
for j in range (0, np):
    print("Par ["+str(j)+"]: ",Par[j])

# Presentar el vector Impar
print("---VECTOR IMPAR---")
for j in range (0, ni):
    print("Impar ["+str(j)+"]: ",Impar[j])