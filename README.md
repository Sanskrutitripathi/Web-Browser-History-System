# Web Browser History System

A simple Java-based command-line system to simulate the browsing history of a web browser using data structures like Stack. It allows users to visit pages, go back and forward in the history, and view or clear the browsing history.

## Features

- **Visit Page**: Allows the user to visit a new page (URL) and add it to the browsing history.
- **Go Backward**: Go back to the previous page from the current history.
- **Go Forward**: Move forward to the next page in the forward history.
- **View History**: Displays the visited URLs in reverse order (most recent first).
- **Clear History**: Clears both the browsing and forward history.
- **Current Page**: Displays the current page the user is on.

## Usage

1. **Compile**: 
    ```bash
    javac WebBrowserHistory.java
    ```

2. **Run**:
    ```bash
    java WebBrowserHistory
    ```

3. **Menu Options**:
    - **1. Visit Page**: Add a new page URL to the history.
    - **2. Go Backward**: Move backward to the last visited page.
    - **3. Go Forward**: Move forward to a page in the forward history.
    - **4. View History**: View the complete browsing history.
    - **5. Clear History**: Clear all browsing history.
    - **6. Current Page**: View the page you are currently on.
    - **7. Exit**: Exit the browser history program.

## URL Validation

The system validates URLs to ensure they start with `http://` or `https://` before allowing the user to visit them.

## Data Structures Used

- **Stack**: Used to maintain the browsing history (`history`) and the forward history (`fhistory`).
  
## Future Enhancements

- Add bookmarks feature.
- Integrate history with persistent storage (e.g., file or database).
- Implement GUI for better user interaction.
