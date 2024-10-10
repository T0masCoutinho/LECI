library IEEE;
use IEEE.STD_LOGIC_1164.all;
entity FullAdder is
port(a, b, cin : in std_logic;
s, cout
: out std_logic);
end FullAdder;
architecture Behavioral of FullAdder is
begin

s <= cin XOR (a XOR b);
cout <= (a AND b) OR (b AND cin) OR (a AND cin); 

end Behavioral;