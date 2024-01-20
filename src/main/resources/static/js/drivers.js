function changeContent(buttonId) {
    var mainContent = document.getElementById('main-content');

    switch (buttonId) {
        case 'button1':
            mainContent.innerHTML = '<div id="content"><p>Dashboard content goes here.</p></div>';
            break;

        case 'button2':
            mainContent.innerHTML = generateDriversTable();
            break;

        case 'button3':
            mainContent.innerHTML = '<div id="content"><p>Passengers Content Goes Here.</p></div>';
            break;

        case 'button4':
            mainContent.innerHTML = '<div id="content"><p>Trips Content Goes Here.</p></div>';
            break;

        default:
            mainContent.innerHTML = '<div id="content"><p>Welcome! Select a button from the sidebar.</p></div>';
            break;
    }
}

function generateDriversTable() {
    var tableHTML = '<div id="content"><h2>Drivers</h2>';
    tableHTML += '<div class="table-toolbar">';
    tableHTML += '<button class="create-button" onclick="createDriver()">&#10010; Create</button>';
    tableHTML += '<button class="show-all-button" onclick="displayAllDrivers()">&#128065; Show All</button>';
    tableHTML += '</div>';
    tableHTML += '<table class="responsive-table">';
    tableHTML += '<thead><tr>';
    tableHTML += '<th>ID</th>';
    tableHTML += '<th>Name <span class="search-icon" onclick="searchColumn(\'name\')">&#128269;</span></th>';
    tableHTML += '<th>Email <span class="search-icon" onclick="searchColumn(\'email\')">&#128269;</span></th>';
    tableHTML += '<th>Mobile Number <span class="search-icon" onclick="searchColumn(\'mobileNumber\')">&#128269;</span></th>';
    tableHTML += '<th>Vehicle Number <span class="search-icon" onclick="searchColumn(\'vehicleNumber\')">&#128269;</span></th>';
    tableHTML += '<th>Action</th>';
    tableHTML += '</tr></thead>';
    tableHTML += '<tbody>';

    for (var i = 1; i <= 5; i++) {
        var randomData = {
            id: i,
            name: 'Driver ' + i,
            email: 'driver' + i + '@example.com',
            mobileNumber: generateRandomPhoneNumber(),
            vehicleNumber: 'ABC' + i + 'XYZ'
        };

        tableHTML += `<tr>
            <td>${randomData.id}</td>
            <td>${randomData.name}</td>
            <td>${randomData.email}</td>
            <td>${randomData.mobileNumber}</td>
            <td>${randomData.vehicleNumber}</td>
            <td>
                <span class="action-icon" onclick="editDriver('${randomData.name}')">&#9998;</span>
                <span class="action-icon" onclick="removeDriver('${randomData.name}')">&#128465;</span>
            </td>
        </tr>`;
    }

    tableHTML += '</tbody></table>';
    tableHTML += '<p id="no-data-msg" style="display: none; color: red;">No data found.</p></div>';
    return tableHTML;
}

// ... (unchanged code)


// ... (unchanged code)

function displayAllDrivers() {
    var rows = document.querySelectorAll('.responsive-table tbody tr');
    var noDataMsg = document.getElementById('no-data-msg');

    rows.forEach(function (row) {
        row.style.display = ''; // Show all rows
    });

    noDataMsg.style.display = 'none'; // Hide no data message
}


function searchColumn(column) {
    var searchTerm = prompt('Enter ' + column + ' to Search:');
    if (searchTerm !== null) {
        searchTerm = searchTerm.toLowerCase(); // Convert to lowercase for case-insensitive search

        var rows = document.querySelectorAll('.responsive-table tbody tr');
        var noDataMsg = document.getElementById('no-data-msg');

        var foundMatch = false;

        rows.forEach(function (row) {
            var cellContent = row.querySelector('td:nth-child(' + getColumnIndex(column) + ')').textContent.toLowerCase();

            if (cellContent.includes(searchTerm)) {
                row.style.display = ''; // Show matching rows
                foundMatch = true;
            } else {
                row.style.display = 'none'; // Hide non-matching rows
            }
        });

        noDataMsg.style.display = foundMatch ? 'none' : 'block';
    }
}

function getColumnIndex(column) {
    switch (column) {
        case 'name':
            return 1; // Index of Name column
        case 'email':
            return 2; // Index of Email column
        case 'mobileNumber':
            return 3; // Index of Mobile Number column
        case 'vehicleNumber':
            return 4; // Index of Vehicle Number column
        default:
            return 0; // Default to the first column if not found
    }
}
function createDriver() {
    alert('Create new driver functionality goes here.'); // Placeholder for actual create functionality
}





function editDriver(driverName) {
    // Implement edit functionality, e.g., show a modal or navigate to an edit page
    alert('Edit Driver: ' + driverName);
}

function removeDriver(driverName) {
    // Implement remove functionality, e.g., show a confirmation dialog or make an API call
    alert('Remove Driver: ' + driverName);
}

function generateRandomPhoneNumber() {
    var phoneNumber = '9';
    for (var i = 0; i < 9; i++) {
        phoneNumber += Math.floor(Math.random() * 10);
    }
    return phoneNumber;
}
