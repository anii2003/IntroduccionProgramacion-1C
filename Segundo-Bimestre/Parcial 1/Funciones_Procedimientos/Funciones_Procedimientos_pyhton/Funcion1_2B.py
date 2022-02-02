print("")
# ****Método principal*****

# Inicializar las variables
num = 0

# Ingresar los datos
print("Procedimiento para verificar si un número es par o impar")
num = int(input("Ingrese el número a verificar: "))

# ****Procedimiento para verificar si un número es par o impar*****

def ParImpar(numero):
    if (numero % 2 == 0):
        print("El número ",numero," es par")
    
    else:
        print("El número ",numero," es impar")

ParImpar(num)
print("***Fin del procedimiento 1***")

# ****Procedimiento para verificar si un número es positivo o negativo*****
def NegPos (numero):
    if (numero > 0):
       print("El número ",numero," es positivo")
    else:
        print("El número ",numero," es negativo")

NegPos(num)
print("***Fin del procedimiento 2***")