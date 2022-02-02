print("")
# Inicializar las variables
i = 0; n = 5

# Declaramos los vectores
A = [None]*n
B = [None]*n

print("***INGRESE LOS DATOS DEL VECTOR A***")
for i in range (0, n):
    A[i] = int(input("Ingrese el elemento A["+str(i)+"]: "))

print("***INGRESE LOS DATOS DEL VECTOR B***")
for i in range (0, n):
    B[i] = int(input("Ingrese el elemento B["+str(i)+"]: "))

# Comparar ambos vectores
print("***RESULTADOS***")
for i in range (0, n):
    if (A[i] == B[i]):
        print("El vector A y B en la posición "+str(i)+" tienen el mismo número (",A[i],")")
    else:
        print("El vector A["+str(i)+"]"+" y el vector B ["+str(i)+"] no tienen el mismo número.")
        print("A = ",A[i]," y B = ",B[i])