import random

print("=== JUEGO: ADIVINA EL NÚMERO ===")
print("Estoy pensando en un número del 1 al 50...")

# Número secreto aleatorio
numero_secreto = random.randint(1, 50)
intentos = 0
adivinado = False

# Mientras no adivine
while not adivinado:
    try:
        intento = int(input("Tu intento: "))
        intentos += 1

        if intento < numero_secreto:
            print("[Demasiado bajo]")
            
        elif intento > numero_secreto:
            print("[Demasiado alto]")
            
        else:
            print(f"🎉 ¡Correcto! El número era {numero_secreto}")
            print(f"Lo lograste en {intentos} intentos.")
            adivinado = True

    except ValueError:
        print("[Solo se permiten números]")

print("Gracias por jugar")
