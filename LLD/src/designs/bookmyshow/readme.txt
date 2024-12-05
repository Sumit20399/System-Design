Requirements:
1. Users can search for movies, theaters, or shows.
2. Users can book tickets for a specific movie, theater, and show.
3. The system should handle seat selection and pricing.
4. Payment processing should be included.
5. Administrative features to add/remove movies, theaters, and shows.

Key Classes:
1. User: Represents a customer.
2. Movie: Represents movie details.
3. Theater: Represents theaters and their screens.
4. Show: Represents a show of a movie in a theater at a specific time.
5. Seat: Represents individual seats in a screen.
6. Booking: Represents a booking made by a user.
7. Payment: Handles payment processing.

Key Features in the Design:
1. Extensibility: Easily add features like multiple theaters, loyalty points, or discounts.
2. Modularity: Each component has a single responsibility.
3. Scalability: New payment methods or seat types can be added without affecting existing classes.
4. Encapsulation: Implementation details are hidden, with well-defined interfaces.
5. This design is flexible for future enhancements, such as adding showtimes, discounts, or additional payment methods.