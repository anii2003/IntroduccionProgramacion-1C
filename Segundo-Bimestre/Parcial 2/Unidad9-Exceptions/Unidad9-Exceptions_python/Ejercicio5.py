print("")
# Inicializar las variables
valor1 = 0; valor2 = 0; resultado = 0

# Proceso
try:
    valor1 = int(input("Ingrese el valor 1: ")) 
    valor2 = int(input("Ingrese el valor 2: ")) 

    if ((valor1 < 0) or (valor2 < 0)):
        print("")
        raise print("ERROR: no se permite ingresar números negativos")
    
    if (valor1 > 20 ):
        print("")
        raise print("ERROR: el primer valor no debe ser mayor a 20")
    
    resultado = valor1/valor2

    print("El resultado es: ",resultado)

except Exception as e:
    print("")
    print("Ha ocurrido una excepción de tipo",e)
    print("")