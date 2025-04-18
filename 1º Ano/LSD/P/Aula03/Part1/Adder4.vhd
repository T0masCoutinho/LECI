library IEEE;
use IEEE.STD_LOGIC_1164.all;

entity Adder4 is
port(a, b : in std_logic_vector(3 downto 0);
cin : in std_logic;
s : out std_logic_vector(3 downto 0);
cout : out std_logic);
end Adder4;
architecture Structural of Adder4 is
	signal c1,c2,c3: STD_LOGIC;
begin
bit0: entity work.FullAdder(Behavioral)
port map(a => a(0),
b => b(0),
cin => cin,
s => s(0),
cout => carryOut(0));
-- complete para os restantes bits (1 a 3)
end Structural;