print("")
# ****Método principal*****

# Inicializar las variables
num = 0
esImpar = True and False
esPrimo = True and False

# Ingresar los datos
print("Función para verificar si un número es impar y primo")
num = int(input("Ingrese el número a verificar: "))

# Función Primo
def Primo (numero):
    div = 0

    for i in range (1, numero+1):
        if (numero % i == 0):
            div = div + 1
    
    if (div == 2):
        return True

    else: 
        return False

# Función Impar
def Impar(numero):
    if (numero % 2 == 0):
        return False
    else:
        return True

# Asignarle un valor a la función
esImpar = Impar(num)

# Proceso
if (esImpar == True):
    esPrimo = Primo(num)

    if (esPrimo == True):
        print("El número ",num," es impar y es primo")
    
    else:
        print("El número ",num," es impar pero no es primo")

else:
    print("El número ",num," no es impar, por lo tanto no se verifica que sea primo")