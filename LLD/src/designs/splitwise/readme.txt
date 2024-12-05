Requirements:
1. Users can create groups to share expenses.
2. Expenses can be split equally or unequally among users.
3. Support for various expense types:
    Equal split
    Percentage split
    Exact amount split
4. Balances between users are tracked, and settlements are allowed.
5. Groups and personal expenses should be supported.

Key Classes:
User : Represents a user in the system.
Group : Represents a group of users sharing expenses.
Expense : Abstract class for different types of expenses.
BalanceSheet : Tracks balances between users.
Split : Represents how the expense is split (Equal, Exact, Percentage).
ExpenseManager : Handles the overall logic for managing expenses and groups.