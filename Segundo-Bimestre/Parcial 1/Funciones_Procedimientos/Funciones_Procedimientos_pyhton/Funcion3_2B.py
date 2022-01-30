print("")
# ****Método principal*****

# Inicializar las variables
num = 0
esImpar = True and False

# Ingresar los datos
print("Función para verificar si un número es impar y un procedimiento para verificar si es primo")
num = int(input("Ingrese el número a verificar: "))

# Función Impar
def Impar(numero):
    if (numero % 2 == 0):
        return False
    else:
        return True

esImpar =Impar(num)

# Procedimiento Primo
def Primo(numero):
    div = 0
    
    for i in range (1, (numero+1)):
        if (numero % i == 0):
            div = div + 1
    
    if (div == 2):
        print("El número ",numero," es impar y primo")
    else:
        print("El número ",numero," es impar y no es primo")

if (esImpar == True):
    Primo(num)
else:
    print("El número no es par, por lo cual no se verifica si es primo")
