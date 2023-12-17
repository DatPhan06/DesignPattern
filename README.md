# Gia Đình - Kiểm Thử Phả Hệ Gia Đình
## Giới Thiệu
Ex1Test là một lớp Java thực hiện kiểm thử và hiển thị thông tin về phả hệ gia đình. Nó sử dụng lớp Person để đại diện cho từng cá nhân trong gia đình, bao gồm thông tin như tên, ngày sinh, giới tính, thông tin về hôn nhân, và danh sách con cái.

## Cách Sử Dụng
1. Tạo đối tượng Person để mô phỏng thông tin về các thành viên trong gia đình.
2. Thêm các con cái cho mỗi người bằng cách sử dụng phương thức addChild.
3. Khởi tạo danh sách để theo dõi thông tin gia đình và thực hiện kiểm thử.
4. In ra thông tin về các cặp vợ chồng có 2 con.
5. In ra thông tin về thế hệ mới nhất trong danh sách phả hệ.

## Cấu Trúc Code
### Lớp Person
- Các Thuộc Tính 
  + name: Tên của người.
  + Date: Ngày sinh của người.
  + sex: Giới tính của người.
  + married: Thông tin về hôn nhân của người.
  + children: Danh sách con cái của người.
- Các Phương Thức Chính
  + addChild: Thêm một đối tượng Person làm con cái cho người.
  + toString: Chuyển đối tượng Person thành một chuỗi String.
### Lớp Ex1Test
- Phương Thức Chính
  + main: Phương thức chính thực hiện kiểm thử và hiển thị thông tin về phả hệ gia đình.
## Yêu Cầu
- Java Development Kit (JDK) 8 trở lên.