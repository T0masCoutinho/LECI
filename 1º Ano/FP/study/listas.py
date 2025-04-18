lista = [
    ("Aveiro", "Albergaria", 20, 60)
]

def printTrip(trip):
   
    print(f"{'Segment':<20}{'Distance':<10}{'Time':<10}{'Speed':<10}")
    print("-" * 50)

    for segment in trip:
        origin, destination, distance, time = segment
        speed = distance / (time / 60)
        hours = time // 60
        minutes = time % 60
        print(f"{origin}-{destination:<16}{distance}km     {hours:03d}h{minutes:02d}min   {speed:.1f}km/h")



printTrip(lista)

