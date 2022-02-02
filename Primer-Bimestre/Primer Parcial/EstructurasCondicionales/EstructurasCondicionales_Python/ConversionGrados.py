print("")

# Inicializar las variables
gC = 0; gF = 0; gK = 0

#Entrada de los datos
print("Estructuras lógicas condicionales simples")
print("")
print("***Programa para conversión de grados***\n")
        
gC = float(input("Ingrese los grados centígrados: "))
print("")

# Proceso
if (gC > 0):
            
    gF = (9/5)*(gC + 32)
    gK = gC + 273.15 
    print("La equivalencia en grados F es: " ,gF)
    print("")
    print("La equivalencia en grados K es: " ,gK)
    print("")      
        
else:
    print("Los grados ingresados son negativos"
    + " no se puede realizar la conversión")
    print("")

print("")