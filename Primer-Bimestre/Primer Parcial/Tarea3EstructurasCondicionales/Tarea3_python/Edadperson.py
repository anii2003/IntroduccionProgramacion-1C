print("")
print("***Programa para calcular su edad en años, meses y días respectivamente***")
print("")

# Declaración e inicialización de variables

anioN = 0
mesN = 0
diaN = 0
anioA = 0
mesA = 0
diaA = 0
anios = 0
meses = 0
dias = 0
opc = 0

anioN = int(input("Ingrese su año de nacimiento: "))
mesN = int(input("Ingrese su mes de nacimiento: "))
diaN = int(input("Ingrese su día de nacimiento: "))
print("")

anioA = int(input("Ingrese el año actual: "))
mesA = int(input("Ingrese el mes actual: "))
diaA = int(input("Ingrese el día actual: "))
print("")

# Proceso

if (((mesN > mesA) and (mesA<=12) and (mesN<=12))) :
    anios = (anioA - anioN)-1

else:
    anios = anioA - anioN

if (mesN <= mesA) :
    meses = (mesA - mesN)

else:
    meses = 12 - (mesN - mesA)

if (diaN > diaA):

    print("Escoja una opcion del siguiente menú: ")
    print("1. Mi mes de nacimiento tiene 30 días")
    print("2. Mi mes de nacimiento tiene 31 días")
    print("")

    opc = int(input("Ingrese una opción: "))

    if opc == 1 :
        dias = 30 - (diaN - diaA)
    
    elif opc == 2 :
        dias = 31 - (diaN - diaA)
    
    else:
        print("")
        print("****La opción que ingresó no es válida, por favor vuelva a ingresar****\n")
        print("")
else:
    dias = diaA - diaN

if (meses > 12):
    anios = anios + 1

if (dias > 30):
    dias = meses - 1

print("")

# Datos de salida
print("Estimado/a usuario: \nSu edad equivale a " ,anios, " años, " ,meses, " meses y " ,dias, " días.")
print("")