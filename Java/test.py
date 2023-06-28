exit = False
while True:
    onTrack = input("Is missile on track? ")
    if onTrack.lower() == "yes":
        print("Missile now on track")
        onTarget = input("Is missile on target? ")
        if onTarget.lower() == "yes":
            print("Blowing up target")
            exit = True
            break
    else:
        print("Blowing up missile... Missile blown up?")
        exit = True
        break
