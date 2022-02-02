print("")
# Declarar e inicializar las variables
n = 0; i = 0; j = 0
EsSime = True or False

# Ingresar el tamaño de la matriz
n = int(input("Ingrese el tamaño de la matriz cuadrada: "))

# Declarar las matrices
A = []

# Ingresar los elementos de la matriz A
print("***Ingrese los elementos de la matriz A***")
for i in range (0,n):
    A.append([])
    for j in range (0, n):
            valor = int(input("A ["+str(i)+"]["+str(j)+"] : "))
            A[i].append(valor)

# Función Simétrica
def Simetrica(A, n):
    band = 0

    # Determinar si la matriz es simétrica o no
    for i in range (0,n):
        for j in range (0,n):
            if (A[i][j] != A[j][i]):
                band = 1
    
    if (band == 1):
        return False
    
    else:
        return True

# Asignarle un valor a la función
EsSime = Simetrica(A, n)

if (EsSime == False):
    print("***La matriz NO es simétrica***")
else:
    if(EsSime == True):
        print("***La matriz es simétrica***")