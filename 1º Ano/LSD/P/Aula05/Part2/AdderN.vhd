library IEEE;
use IEEE.STD_LOGIC_1164.all;
use IEEE.numeric_std.all;

entity AdderN is
    generic ( n : positive := 8);
    port
    (
        operand0 : in  std_logic_vector((n-1) downto 0 );
        operand1 : in  std_logic_vector((n-1) downto 0 );
        result   : out std_logic_vector((n-1) downto 0 )
    );
end AdderN;

architecture Behavioral of AdderN is
begin
    result <= std_logic_vector(unsigned(operand0) + unsigned(operand1));
end Behavioral;